package com.lizy.util_tool;

/**
 * 该类专门用于图片处理(图片压缩、缩放和旋转等操作)	
 * @author lizy
 *
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageProcess {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		 ImageProcess thumbnailatorTest = new ImageProcess();
		/* thumbnailatorTest.test1(); */
		/* thumbnailatorTest.test2(); */
		/*
		 * thumbnailatorTest.test3(); thumbnailatorTest.test4();
		 */
		/* thumbnailatorTest.test5(); */
		/*
		 * thumbnailatorTest.test6(); thumbnailatorTest.test7();
		 * thumbnailatorTest.test8(); thumbnailatorTest.test9();
		 */
		thumbnailatorTest.test10();
		//bulkCreateMinImageByDic("D:\\usr\\local\\tomcat8\\webapps\\file\\userfiles\\images\\photos", 0.00f, 0.00f, 0);
	}

	/**
	 * 批量生产图片的min文件
	 * 
	 * @param dic
	 *            文件目录
	 * @param scale
	 *            缩放比例,0不控制，其他控制
	 * @param outputQuality
	 *            压缩比例
	 * @throws IOException 
	 */
	public static void bulkCreateMinImageByDic(String dic, float scale, float outputQuality, int yaSuoType) throws IOException {
		// 首先判断目录存不存在
		if (dic == null || dic == "") {
			System.out.println("文件目录为空");
			return;
		}
		File file = new File(dic);
		File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
		if (files == null) {// 如果目录为空，直接退出
			System.out.println("文件目录不存在");
			return;
		}

		// 遍历，目录下的所有文件
		for (File f : files) {
			if (f.isFile() && isImageFile(f)) {
				// 处理图片
				// ===
				scale=getOutputQuality(f,yaSuoType);
				createMinImageByFilePath(f, scale, outputQuality, yaSuoType);
				// ===
			} else if (f.isDirectory()) {
				System.out.println(f.getAbsolutePath());
				bulkCreateMinImageByDic(f.getAbsolutePath(), scale, outputQuality, yaSuoType);
			}
		}

	}

	/**
	 * 根据图片的路径产生压缩图
	 * 
	 * @param filePath
	 *            文件的路径
	 * @param scale
	 *            压缩比例
	 * @param outputQuality
	 *            压缩质量
	 * @param yaSuoType
	 *            0,详情压缩;1,列表压缩
	 * @return
	 * @throws IOException
	 */
	public static String createMinImageByFilePath(File file, float scale, float outputQuality, int yaSuoType)
			throws IOException {
		// 获取文件后缀名
		String fileOriginalFileName = file.getName();
		String fileName = fileOriginalFileName.substring(0, fileOriginalFileName.lastIndexOf("."));
		String suffixFileType = fileOriginalFileName.substring(fileOriginalFileName.lastIndexOf(".")).toLowerCase();
		String newFileName = fileName + ".min" + String.valueOf(yaSuoType) + suffixFileType;
		System.out.println("老的文件名：" + fileOriginalFileName);
		System.out.println("新的文件名：" + newFileName);
		String fileDicPath = file.getParent();
		String newFilePath=fileDicPath + "/" + newFileName;
		System.out.println(fileDicPath);
		Thumbnails.of(file.getAbsolutePath()).scale(1f).outputQuality(0.25f).toFile(newFilePath);
		return newFilePath;

	}

	/**
	 * 判断文件是否是图片类型的文件
	 * 
	 * @param file
	 * @return
	 */
	public static boolean isImageFile(File file) {
		if (file == null) {
			return false;
		}
		// 图片格式BMP、JPG、JPEG、PNG、GIF
		List<String> imgTypeList = Arrays.asList(".bmp", ".jpg", ".jpeg", ".png", ".gif");
		// 获取文件后缀名
		String fileOriginalFileName = file.getName();
		String suffixFileType = fileOriginalFileName.substring(fileOriginalFileName.lastIndexOf(".")).toLowerCase();
		if (!imgTypeList.contains(suffixFileType)) {
			return false;
		}
		return true;
	}

	/**
	 * 根据图片的大小，返回压缩比
	 * 
	 * @param file
	 * @param yaSuoType
	 *            0,详情压缩;1,列表压缩
	 * @return
	 */
	public static float getOutputQuality(File file, int yaSuoType) {
		if (file == null) {
			return 1.00f;
		}
		// 获取文件的大小
		long fileSizeK = file.length();
		// 转换为单位为M；
		double fileSizeM = fileSizeK * 1.00 / (1024 * 1024);
		if (yaSuoType == 0) {
			if (fileSizeM < 0.5) {
				return 1.00f;
			}
			if (fileSizeM < 1.0) {
				return 0.70f;
			}
			if (fileSizeM < 1.5) {
				return 0.50f;
			}
			if (fileSizeM < 2.0) {
				return 0.30f;
			}
			return 0.2f;

		}
		if (yaSuoType == 1) {
			if (fileSizeM < 0.5) {
				return 1.00f;
			}
			if (fileSizeM < 1.0) {
				return 0.30f;
			}
			if (fileSizeM < 1.5) {
				return 0.20f;
			}
			if (fileSizeM < 2.0) {
				return 0.10f;
			}
			return 0.05f;
		}

		return 1.00f;
	}

	/**
	 * 指定大小进行缩放
	 * 
	 * @throws IOException
	 */
	private void test1() throws IOException {
		/*
		 * size(width,height) 若图片横比200小，高比300小，不变 若图片横比200小，高比300大，高缩小到300，图片比例不变
		 * 若图片横比200大，高比300小，横缩小到200，图片比例不变 若图片横比200大，高比300大，图片按比例缩小，横为200或高为300
		 */
		Thumbnails.of("images/test.jpg").size(200, 300).toFile("images/image_200x300.jpg");
		Thumbnails.of("images/test.jpg").size(2560, 2048).toFile("images/image_2560x2048.jpg");
	}

	/**
	 * 按照比例进行缩放
	 * 
	 * @throws IOException
	 */
	private void test2() throws IOException {
		/**
		 * scale(比例)
		 */
		Thumbnails.of("images/test.jpg").scale(0.25f).toFile("images/image_25%.jpg");
		Thumbnails.of("images/test.jpg").scale(1.10f).toFile("images/image_110%.jpg");
	}

	/**
	 * 不按照比例，指定大小进行缩放
	 * 
	 * @throws IOException
	 */
	private void test3() throws IOException {
		/**
		 * keepAspectRatio(false) 默认是按照比例缩放的
		 */
		Thumbnails.of("images/test.jpg").size(120, 120).keepAspectRatio(false).toFile("images/image_120x120.jpg");
	}

	/**
	 * 旋转
	 * 
	 * @throws IOException
	 */
	private void test4() throws IOException {
		/**
		 * rotate(角度),正数：顺时针 负数：逆时针
		 */
		Thumbnails.of("images/test.jpg").size(1280, 1024).rotate(90).toFile("images/image+90.jpg");
		Thumbnails.of("images/test.jpg").size(1280, 1024).rotate(-90).toFile("images/iamge-90.jpg");
	}

	/**
	 * 水印
	 * 
	 * @throws IOException
	 */
	private void test5() throws IOException {
		/**
		 * watermark(位置，水印图，透明度)
		 */
		Thumbnails.of("images/test.jpg").size(1280, 1024)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("images/watermark.png")), 0.5f)
				.outputQuality(0.8f).toFile("C:/image_watermark_bottom_right.jpg");
		Thumbnails.of("images/test.jpg").size(1280, 1024)
				.watermark(Positions.CENTER, ImageIO.read(new File("images/watermark.png")), 0.5f).outputQuality(0.8f)
				.toFile("C:/image_watermark_center.jpg");
	}

	/**
	 * 裁剪
	 * 
	 * @throws IOException
	 */
	private void test6() throws IOException {
		/**
		 * 图片中心400*400的区域
		 */
		Thumbnails.of("images/test.jpg").sourceRegion(Positions.CENTER, 400, 400).size(200, 200).keepAspectRatio(false)
				.toFile("images/image_region_center.jpg");
		/**
		 * 图片右下400*400的区域
		 */
		Thumbnails.of("images/test.jpg").sourceRegion(Positions.BOTTOM_RIGHT, 400, 400).size(200, 200)
				.keepAspectRatio(false).toFile("images/image_region_bootom_right.jpg");
		/**
		 * 指定坐标
		 */
		Thumbnails.of("images/test.jpg").sourceRegion(600, 500, 400, 400).size(200, 200).keepAspectRatio(false)
				.toFile("images/image_region_coord.jpg");
	}

	/**
	 * 转化图像格式
	 * 
	 * @throws IOException
	 */
	private void test7() throws IOException {
		/**
		 * outputFormat(图像格式)
		 */
		Thumbnails.of("images/test.jpg").size(1280, 1024).outputFormat("png").toFile("images/image_1280x1024.png");
		Thumbnails.of("images/test.jpg").size(1280, 1024).outputFormat("gif").toFile("images/image_1280x1024.gif");
	}

	/**
	 * 输出到OutputStream
	 * 
	 * @throws IOException
	 */
	private void test8() throws IOException {
		/**
		 * toOutputStream(流对象)
		 */
		OutputStream os = new FileOutputStream("images/image_1280x1024_OutputStream.png");
		Thumbnails.of("images/test.jpg").size(1280, 1024).toOutputStream(os);
	}

	/**
	 * 输出到BufferedImage
	 * 
	 * @throws IOException
	 */
	private void test9() throws IOException {
		/**
		 * asBufferedImage() 返回BufferedImage
		 */
		BufferedImage thumbnail = Thumbnails.of("images/test.jpg").size(1280, 1024).asBufferedImage();
		ImageIO.write(thumbnail, "jpg", new File("images/image_1280x1024_BufferedImage.jpg"));
	}

	/**
	 * 图片尺寸不变,按图片质量压缩图片
	 * 
	 * @throws IOException
	 */
	private void test10() throws IOException {
		// 图片尺寸不变，压缩图片文件大小outputQuality实现,参数1为最高质量
		// 图片格式判断
		Thumbnails.of("images/2.png").scale(1f).outputQuality(0.5f).toFile("images/2.min.png");
		Thumbnails.of("images/a.jpg").scale(1f).outputQuality(0.5f).toFile("images/a.min.jpg");
		Thumbnails.of("images/b.jpg").scale(1f).outputQuality(0.5f).toFile("images/b.min.jpg");
		Thumbnails.of("images/熊猫压缩.png").scale(1f).outputQuality(0.5f).toFile("images/熊猫压缩.min.png");
	}

}

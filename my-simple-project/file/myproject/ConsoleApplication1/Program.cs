using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Text.RegularExpressions;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            string regex = "^\\.(?<name>.*?):before\\s*\\{";
            List<string> filePathList = new List<string>()
            {
                @"E:/workspace_self/project-parent/file/myproject/ConsoleApplication1/source/AdminLTE-2.4.5/bower_components/font-awesome/css/font-awesome.css",
               // @"E:/workspace_self/project-parent/file/myproject/ConsoleApplication1/source/AdminLTE-2.4.5/bower_components/bootstrap/dist/css/bootstrap.css",
               
            };
            List<string> ss = new List<string>();
            foreach (var item in filePathList)
            {
                using (StreamReader sr = File.OpenText(item))
                {
                    string s;
                    ;
                    while ((s = sr.ReadLine()) != null)
                    {
                        Regex reg = new Regex(regex);
                        var matches = reg.Matches(s);
                        foreach (var m in matches)
                        {
                            Console.WriteLine(m);
                            ss.Add(m.ToString());
                        }  
                    }
                  
                }
               
                
              
            }
            string path = @"c:\temp\MyTest.txt";
            if (!File.Exists(path))
            {
                // Create a file to write to.
                using (StreamWriter sw = File.CreateText(path))
                {
                    foreach (var aa in ss)
                    {
                        sw.WriteLine(aa);
                    }  
                    
                }
            }
            Console.ReadKey();
            
               
        }
        
    }
}

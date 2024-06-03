package FileClass;

import java.io.File;

//Write a Java program to show the following functions of File class.
//- createNewFile()
//- delete()
//- exists()
//- getName()
//- getAbsolutePath()
//- isDirectory()
//- isFile()
//- list()
//- mkdir()
public class BCAFileAccess {
    public static void main(String[] args) {
        String pathname = "files";
        File file = new File(pathname);
        System.out.println("File name:"+file.getName());
        System.out.println("Path: "+file.getPath());
        System.out.println("Absolute Path:"+file.getAbsolutePath());
        System.out.println("Parent :"+file.getParent());
        System.out.println("Exists: "+file.exists());
        if (file.exists()){
            System.out.println("Is writeable:"+file.canWrite());
            System.out.println("Is readable:"+file.canRead());
            System.out.println("Is a directory:"+file.isDirectory());
            System.out.println("Is a file:"+file.isFile());
            System.out.println("List:"+file.list().length);
            if (file.list().length>0){
                for (int index = 0; index<file.list().length;index++){
                    String name = file.list()[index];
                    System.out.println("\tfile name:"+name);
                    File newFile = new File(file,name);
                    System.out.println("\tAbsolute path:"+newFile.getName());
                    if (newFile.isFile()){
                        System.out.println("\tFile name:"+newFile.getName());

                    }
                    if (newFile.isDirectory()){
                        System.out.println("\t Directory name:"+newFile.getName());
                        File newFolder = new File(newFile,"TeslaImage");
                        newFolder.mkdir();
                        System.out.println("\tdirectory name:"+newFolder.getAbsolutePath());
                        System.out.println("\tdelete :"+newFolder.delete());
                        System.out.println("\tnew directory exist:"+newFolder.exists());
                    }
                }
            }
            System.out.println("mkdir:"+file.mkdir());
            System.out.println("File Size in bytes: "+file.length());
        }
    }
}

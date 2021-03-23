package lesson20;

import java.io.File;
import java.io.FileFilter;

public class Main1 { //Работа с путём(директорией)
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\Денис\\IdeaProjects\\homework");

        if(!startDir.exists()){ //Если данной папки(последняя в пусти) не существует.
            startDir.mkdir(); // создать папку по указаному ранее пути (Возвращает true или false в зависимости от того можно ли создать тут директорию (папку)

        }
        if(startDir.isDirectory()){ // данный пусть это директория?
            File[] innerFiles = startDir.listFiles(new FileFilter() { // с фильтром с помощью которого дальше можно прописать услования что отоброжать(что будет входить в массив файлов.
                @Override
                public boolean accept(File pathname) {
//                    if(pathname.isDirectory()){ //если это папка
//                        return true;
//                    }
                    if (pathname.getName().endsWith(".jpg")){ //если это картинка формата jpg
                        return true;
                    }
                    return false;
                }
            }); //метод достаёт массив файлов и папок.
            for(File f :innerFiles){
                System.out.println(f.getAbsolutePath()); // Возвращает название полного пути к файлу

            }
        }
    }

}

package ObjectAndClassesExercise.Articles;

import ObjectAndClassesExercise.Articles.Article;

import java.util.Scanner;

public class Main {
    public static void Edit(Article.Articles article, String newContent) {
        article.setContent(newContent);
    }

    public static void ChangeAuthor(Article.Articles article, String newAuthor) {
        article.setAuthor(newAuthor);
    }

    public static void Rename(Article.Articles article, String newTitle) {
        article.setTitle(newTitle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Article.Articles article = new Article.Articles(title, content, author);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String commands = scanner.nextLine();
            String command = commands.split(" ")[0];
            switch (command) {
                case "Edit:":
                    String newContent = commands.split(": ")[1];
                    Edit(article, newContent);
                    break;
                case "ChangeAuthor:":
                    String newAuthor = commands.split(": ")[1];
                    ChangeAuthor(article, newAuthor);
                    break;
                case "Rename:":
                    String newTitle = commands.split(": ")[1];
                    Rename(article,newTitle);
                    break;
            }
        }
        System.out.println(article);
    }
}

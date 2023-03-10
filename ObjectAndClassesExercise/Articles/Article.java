package ObjectAndClassesExercise.Articles;

public class Article {

    static class Articles{


        private String title;
        private String content;
        private String author;

public Articles(String title,String content,String author){
    this.title=title;
    this.content=content;
    this.author=author;
}
        public String getTitle(){
            return this.title=title;
        }
        public String getContent(){
            return this.content=content;
        }
        public String getAuthor(){
            return this.author=author;
        }

        public  void setTitle(String title){
            this.title=title;
        }
        public void setContent(String content){
            this.content=content;
        }
        public void setAuthor(String author){
            this.author=author;
        }

        @Override
        public String toString() {
            return getTitle()+ " - "+ getContent()+": "+getAuthor();
        }
    }
}

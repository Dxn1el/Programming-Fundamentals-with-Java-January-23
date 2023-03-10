package ObjectAndClassesExercise.AdvertisementMessage;

public class messageObj {
    static class Message{
        private String phrase;
        private String event;
        private String author;
        private String city;

        public Message(String phrase, String event, String author,String city){
            this.phrase=phrase;
            this.event=event;
            this.author=author;
            this.city=city;
        }
        public String getPhrase(){
            return this.phrase;
        }
        public String getEvent(){
            return this.event;
        }
        public String getAuthor(){
            return this.author;
        }
        public String getCity(){
            return this.city;
        }

    }
}

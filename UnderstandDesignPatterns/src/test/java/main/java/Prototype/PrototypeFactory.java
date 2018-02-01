package main.java.Prototype;

import java.util.HashMap;

public class PrototypeFactory {

    public static class ModelType{
        private static final String MOVIE = "movie";
        private static final String album = "album";
        private static final String show = "show";

        private static HashMap<String, PrototypeCapable> prototypes = new HashMap<>();

        static{
            prototypes.put(ModelType.album, new Album());
            prototypes.put(ModelType.MOVIE, new Movie());
            prototypes.put(ModelType.show, new Show());
        }

        public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException{
            return ((PrototypeCapable)prototypes.get(s).clone());
        }
    }
}

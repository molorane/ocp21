package com.blessing.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FlatMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<User> users = Arrays.asList(
                new User("Millicent", Arrays.asList("Matric", "BA", "CA")),
                new User("Mothusi", Arrays.asList("COSC", "Bsc", "Honors", "OCA")),
                new User("Molorane", Arrays.asList("LGCSE", "Bsc")));

        Optional<Object> v =
                Optional.ofNullable(users.stream()
                        .map(user -> user.getCertificates().toArray(new String[10]))
                        .filter(ls -> ls.length > 2)
                        .flatMap(Arrays::stream)
                        .findAny());

        v.ifPresent(System.out::println);
    }

    static class User {
        private String name;
        private List<String> certificate;

        public User(String name, List<String> certificate) {
            super();
            this.name = name;
            this.certificate = certificate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCertificates() {
            return certificate;
        }

        public void setCertificates(List<String> certificate) {
            this.certificate = certificate;
        }


    }

}

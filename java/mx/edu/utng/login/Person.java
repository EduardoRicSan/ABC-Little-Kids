package mx.edu.utng.login;

/**
 * Created by SERGIO on 01/02/2017.
 */

public class Person {
    private String name;
    private String age;
    private String email;
    private int photoId;
    private int cardColor;

    public Person(String name, String age, String email, int photoId, int cardColor) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.photoId = photoId;
        this.cardColor = cardColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getCardColor() {
        return cardColor;
    }

    public void setCardColor(int cardColor) {
        this.cardColor = cardColor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

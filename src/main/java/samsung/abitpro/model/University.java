package samsung.abitpro.model;

import jakarta.persistence.*;

@Entity
@Table(name ="universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String officialWebsite;
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)
    private boolean isMilitary;
    @Column(nullable = false)
    private int militaryFromCourse;

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getMilitaryFromCourse() {
        return militaryFromCourse;
    }

    public void setMilitaryFromCourse(int militaryFromCourse) {
        this.militaryFromCourse = militaryFromCourse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public University() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public University(long id, String name, String city, String description, String officialWebsite, int rating) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.description = description;
        this.officialWebsite = officialWebsite;
        this.rating = rating;
    }
}

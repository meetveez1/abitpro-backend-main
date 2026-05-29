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
    private boolean isMilitary;
    @Column(nullable = false)
    private int militaryFromCourse;
    @Column(nullable = false)
    private int budgBall;
    @Column(nullable = false)
    private int budgPlace;
    @Column(nullable = false)
    private int paidBall;
    @Column(nullable = false)
    private int paidPlace;
    @Column(nullable = false)
    private int paidCost;
    @Column(nullable = false)
    private int introCoursesPrice;
    @Column(name="popular_programs")
    private String popularPrograms;

    public String getPopularPrograms() {
        return popularPrograms;
    }

    public void setPopularPrograms(String popularPrograms) {
        this.popularPrograms = popularPrograms;
    }

    public int getPaidCost() {
        return paidCost;
    }

    public void setPaidCost(int paidCost) {
        this.paidCost = paidCost;
    }

    public int getIntroCoursesPrice() {
        return introCoursesPrice;
    }

    public void setIntroCoursesPrice(int introCoursesPrice) {
        this.introCoursesPrice = introCoursesPrice;
    }

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

    public int getBudgBall() {
        return budgBall;
    }

    public void setBudgBall(int budgBall) {
        this.budgBall = budgBall;
    }

    public int getBudgPlace() {
        return budgPlace;
    }

    public void setBudgPlace(int budgPlace) {
        this.budgPlace = budgPlace;
    }

    public int getPaidBall() {
        return paidBall;
    }

    public void setPaidBall(int paidBall) {
        this.paidBall = paidBall;
    }

    public int getPaidPlace() {
        return paidPlace;
    }

    public void setPaidPlace(int paidPlace) {
        this.paidPlace = paidPlace;
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

    public University(long id, String name, String city, String description, String officialWebsite, boolean isMilitary, int militaryFromCourse, int budgBall, int budgPlace, int paidBall, int paidPlace, int introCoursesPrice, String popularPrograms) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.description = description;
        this.officialWebsite = officialWebsite;
        this.isMilitary = isMilitary;
        this.militaryFromCourse = militaryFromCourse;
        this.budgBall = budgBall;
        this.budgPlace = budgPlace;
        this.paidBall = paidBall;
        this.paidPlace = paidPlace;
        this.introCoursesPrice = introCoursesPrice;
        this.popularPrograms = popularPrograms;
    }
}

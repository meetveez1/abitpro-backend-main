package samsung.abitpro.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name ="programs")

public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private University university;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private int passingPaidScore;
    @Column(nullable = false)
    private int paidPlaces;
    @Column(nullable = false)
    private int costOfEducation;
    @Column(nullable = false)
    private int passingBudgetScore;
    @Column(nullable = false)
    private int budgetPlaces;
    @Column(nullable = false)
    private String educationForm;
    public Program() {
    }

    public int getCostOfEducation() {
        return costOfEducation;
    }

    public void setCostOfEducation(int costOfEducation) {
        this.costOfEducation = costOfEducation;
    }

    public int getPassingPaidScore() {
        return passingPaidScore;
    }

    public void setPassingPaidScore(int passingPaidScore) {
        this.passingPaidScore = passingPaidScore;
    }

    public int getPassingBudgetScore() {
        return passingBudgetScore;
    }

    public void setPassingBudgetScore(int passingBudgetScore) {
        this.passingBudgetScore = passingBudgetScore;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    public int getPaidPlaces() {
        return paidPlaces;
    }

    public void setPaidPlaces(int paidPlaces) {
        this.paidPlaces = paidPlaces;
    }

    public int getBudgetPlaces() {
        return budgetPlaces;
    }

    public void setBudgetPlaces(int budgetPlaces) {
        this.budgetPlaces = budgetPlaces;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Program(long id, University university, String name, String code, int passingPaidScore, int paidPlaces, int costOfEducation, int passingBudgetScore, int budgetPlaces, String educationForm) {
        this.id = id;
        this.university = university;
        this.name = name;
        this.code = code;
        this.passingPaidScore = passingPaidScore;
        this.paidPlaces = paidPlaces;
        this.costOfEducation = costOfEducation;
        this.passingBudgetScore = passingBudgetScore;
        this.budgetPlaces = budgetPlaces;
        this.educationForm = educationForm;
    }
}

package samsung.abitpro.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "favorite_university")
public class FavouriteUniversity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private University university;

    public FavouriteUniversity() {
    }

    public LocalDate getAddAt() {
        return addedAt;
    }

    public void setAddAt(LocalDate addAt) {
        this.addedAt = addAt;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    private LocalDate addedAt;

    public FavouriteUniversity(long id, User user, University university, LocalDate addedAt) {
        this.id = id;
        this.user = user;
        this.university = university;
        this.addedAt = addedAt;
    }
}

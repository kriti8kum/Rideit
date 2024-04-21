package com.example.Rideit.Model;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String panNumber;
    int age;
    @Column(unique = true,nullable =false)
    String mobNo;
    double rating;
    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();

}

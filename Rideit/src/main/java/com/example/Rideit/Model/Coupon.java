package com.example.Rideit.Model;
import com.example.Rideit.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
public class Customer {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    @Column(unique = true, nullable = false)
    String emailId;
    String address;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();


}

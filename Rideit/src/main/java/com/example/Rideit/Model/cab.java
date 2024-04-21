package com.example.Rideit.Model;
import com.example.Rideit.Enum.CarType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)

public class cab {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String company;

    String carModel;
    @Enumerated(EnumType.STRING)
    CarType carType;

    int numberOfSeats;

    double farePerKm;
    @OneToOne
    @JoinColumn
    Driver driver;

}

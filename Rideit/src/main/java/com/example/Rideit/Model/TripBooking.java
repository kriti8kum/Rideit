package com.example.Rideit.Model;
import com.example.Rideit.Enum.TripStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String source;
    String destination;
    double tripDistanceInKm;
    double totalFare;
    TripStatus tripStatus;
    @CreationTimestamp
    Date bookedAt;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @ManyToOne
    @JoinColumn
    Driver driver;

}

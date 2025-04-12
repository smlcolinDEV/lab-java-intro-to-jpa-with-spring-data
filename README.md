![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Intro to JPA with Spring Data

### Instructions

1. Fork this repo.
2. Clone your fork to your local machine.
3. Solve the challenges.


## Deliverables

- Upon completion, add your solution to git.
- Then commit to git and push to your repo on GitHub.
- Make a pull request and paste the pull request link in the submission field in the Student Portal.


## Introduction

You’ve now learned how to create entity objects and use JPA repositories to query data. In this lab, you’ll apply those concepts by modeling an airline booking system.

## Objectives

By the end of this lab, you should be able to:
- Design JPA entities using enum values and basic attributes
- Set up and use `JpaRepository` interfaces
- Create and use simple queries derived from method names
- Write clean, maintainable models using JPA best practices


## Provided Dataset

We’re going to represent the booking system using data from the airline lab (Lab 3.01). Your mission is to design the classes and database structure for the following entities:

- `Customer`
- `Flight`
- `FlightBooking`

You'll also create an enum `CustomerStatus`.

## Deliverables

You need to model and map the following:

### 1. `CustomerStatus` Enum

Create an enum with these values:
```java
GOLD, SILVER, NONE
```

Use it inside your `Customer` entity. Don’t forget to annotate the field with `@Enumerated(EnumType.STRING)`.

### 2. `Customer` Entity

Attributes:
- A unique auto-generated ID
- A name (String)
- A status (enum `CustomerStatus`)
- Total miles flown (Integer)

Use proper annotations to map it as a table.

### 3. `Flight` Entity

Attributes:
- Auto-generated ID
- Flight number (String)
- Aircraft (String)
- Total number of seats (Integer)
- Mileage (Integer)

Map it properly with JPA annotations.

### 4. `FlightBooking` Entity

Attributes:
- Auto-generated ID
- Customer ID (Integer)
- Flight ID (Integer)

> For now, do **not** use `@ManyToOne`. Just store the foreign keys as fields. We’ll introduce entity relationships in a future lesson.

## Tasks

1. Define the four classes above with appropriate annotations.
2. Create the corresponding `JpaRepository` interfaces for each entity.
3. Use CommandLineRunner to create at least 3 sample entries for each table. Example in the Main clas (can be also added in a @Configuration class):
	```java
	@SpringBootApplication
	public class DemoApplication {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}

		@Bean
		CommandLineRunner run(CustomerRepository customerRepo,
							FlightRepository flightRepo,
							FlightBookingRepository bookingRepo) {
			return args -> {
				Customer alice = customerRepo.save(new Customer("Alice", CustomerStatus.GOLD, 120000));
				Flight flight = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
				bookingRepo.save(new FlightBooking(alice.getId(), flight.getId()));
			};
		}
	}
	```
4. Add a query method in `CustomerRepository` to find customers by status:
5. Add a query method in `FlightBookingRepository` to find bookings by customer ID:

## Extra Practice

Try these extra tasks if you finish early:

- Add a method in `FlightBookingRepository` to find bookings by flight ID
- Add a method in `CustomerRepository` to find customers with mileage over 100,000


## FAQs

<details>
  <summary> Can I use CommandLineRunner to seed my data?</summary>

<br>

Yes! You can use `@Bean CommandLineRunner` to insert a few test entries when the application starts. Or use Postman to POST them via a REST controller.

</details>

<details>
  <summary> Should I define relationships between entities?</summary>

<br>

Not yet! For now, just store the IDs (`customerId`, `flightId`) directly in `FlightBooking`. We’ll learn about `@ManyToOne` and other relationships in an upcoming lesson.

</details>

<details>
  <summary> What if I get errors when saving data?</summary>

<br>

Make sure your entity classes have:
- An empty constructor
- Proper data types
- `@Entity`, `@Id`, and `@GeneratedValue` annotations where needed

</details>




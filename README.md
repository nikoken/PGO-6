# PGO Tutorial 6 - Training Membership Plan Management System
This project implements a comprehensive membership management system for **ActiveZone**, a fitness and wellness provider. It demonstrates advanced Java OOP concepts, specifically the coordination between abstract classes and multiple interfaces to handle complex business logic.
## Key OOP Concepts Implemented
*   **Abstract Classes & Methods**: Used `MembershipPlan` as a base template to prevent direct instantiation of generic plans while enforcing a common structure.
*   **Interface Implementation**:
   *   `Billable`: Defines the contract for price calculations (Net and Gross).
   *   `RemoteAccess`: Identifies plans that provide digital or online services.
   *   `Freezable`: Identifies plans that allow temporary suspension based on specific business rules.
*   **Polymorphism**: All plan types are stored in a single `MembershipPlan[]` array and processed through their shared abstract type.
*   **Encapsulation**: All fields are strictly `private`, with access provided through constructors and protected/public getters.
## Plan Types & Business Logic
| Plan Type | Key Features | Pricing Logic Highlights |
| :--- | :--- | :--- |
| **Gym Membership** | Entries per month, Sauna access | Base + Entry fees + Optional Sauna fee - Auto-renew discount. |
| **Personal Training** | Trainer level (1-3), Diet consultation | Base + Session fees + Trainer level surcharges + Diet fee - Auto-renew discount. |
| **Online Coaching** | Video consultations, Meal plans | Base + Consultation fees + Digital resource surcharges. |
| **Corporate Wellness** | Bulk employee coverage, Workshops | Per-employee fee + Workshop fees + 12% discount for 20+ employees. |
## Freezing & Online Access Logic
*   **Freezing**:
   *   Gym plans: Requires min. 3 months duration.
   *   Corporate plans: Requires min. 6 months duration AND zero active workshops.
*   **Remote Access**:
   *   Online plans: Always enabled.
   *   Corporate plans: Depends on the availability of the Online Dashboard.
## Technical Stack
*   **Language**: Java
*   **IDE**: IntelliJ IDEA
*   **Architecture**: Interface-driven design with Abstract Base Classes

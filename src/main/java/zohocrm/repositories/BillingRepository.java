package zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}

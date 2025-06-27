package in.pdf.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pdf.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}

package in.raj.controllers;

import in.raj.dtos.InterestRate;
import in.raj.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping(path = "/loans")
    public ResponseEntity<InterestRate> getLoansByType(@RequestParam("type") String type) {
        return ResponseEntity.ok().body(loanService.getAllLoansByType(type.toUpperCase()));
    }
}

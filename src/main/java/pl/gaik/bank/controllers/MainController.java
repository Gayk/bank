package pl.gaik.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.gaik.bank.models.forms.CreditForm;

/**
 * Created by monik on 14.10.2017.
 */
@Controller
public class MainController {


    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute( "creditForm", new CreditForm() );
        return "formTemplate";
    }

    @PostMapping("/")
    public String formTemplate(@ModelAttribute("creditForm") CreditForm creditForm, Model model) {
        model.addAttribute( "info", periodTrue( creditForm.getSalary(),
                creditForm.getCosts(),
                creditForm.getCredit(),
                creditForm.getPeriod() ) );
        return "formTemplate";
    }
//    public String newform(@RequestParam("income") int income,
//                          @RequestParam ("amount") int amount,
//                          @RequestParam("amountOfLoan") int amountOfLoan,
//                          @RequestParam("period")int period, Model model){
//        int infoYou = (income-amount);
//        int infoBank = amountOfLoan/period;
//        model.addAttribute( "info",periodTrue( income,amount,amountOfLoan,period ));
//        //model.addAttribute( "color", "green" );
//        return "formTemplate";


    // }
    private String periodTrue(int salary, int costs, int credit, int period) {
            int infoYou=salary- costs;
            int infoBank = credit/period;
            if(0.3*infoYou>infoBank){
                return "Dostajesz kredyt";

            }else if(0.3*infoYou<infoBank){
                for( int i=0; i<infoBank;i++){
                    period+=1;
                }
                return "Dostajesz kredyt na "+period+"miesięcy";
            }
            else{
                return "nie dostajesz kretydu";
            }

       // return (salary - costs) * 0.30 > credit / period ? "Dostajesz kredyt" : "twój okres kretytowania" ;

    }

}









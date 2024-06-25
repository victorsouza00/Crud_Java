package com.rungroop.web.controller;


import com.rungroop.web.dto.ClubDto;
import com.rungroop.web.services.ClubServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {
    private ClubServices clubService;
    @Autowired
    private ClubController(ClubServices clubServices) {
        this.clubService = clubServices;

    }

    @GetMapping("/clubs")
    public  String listClubs(Model model){
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs" , clubs);
        return "clubs-list";
    }

}

package com.rungroop.web.services;

import com.rungroop.web.dto.ClubDto;


import javax.swing.*;
import java.util.List;

public interface ClubServices {

    List<ClubDto> findAllClubs();

}

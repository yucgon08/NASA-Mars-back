package com.project.mars.controller;

import com.project.mars.service.PreferenceService;
import com.project.mars.service.UserService;
import com.project.mars.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
@CrossOrigin
public class PreferenceController {

    @Autowired
    PreferenceService preferenceService;

    @PostMapping("/get_photo")
    public Result getPhoto(@RequestParam("rover") String rover, @RequestParam("mars_sol")String mars_sol) {
        return preferenceService.getPhoto(rover, mars_sol);
    }

    @PostMapping("/get_preference")
    public Result getPreference(@RequestParam("rover") String rover, @RequestParam("mars_sol")String mars_sol) {
        return preferenceService.getPreference(rover, mars_sol);
    }

    @PostMapping("/save_preference")
    public Result savePreference(@RequestParam("rover") String rover, @RequestParam("mars_sol")String mars_sol) {
        return preferenceService.savePhoto(rover, mars_sol);
    }
}

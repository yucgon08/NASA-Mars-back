package com.project.mars.service;

import com.project.mars.vo.Result;

public interface PreferenceService {
    Result getPhoto(String rover, String mars_sol);
    Result getPreference(String rover, String mars_sol);
    Result savePhoto(String rover, String mars_sol);
}

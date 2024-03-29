package com.dxc.luxoft.service;

import org.springframework.stereotype.Service;

import com.dxc.luxoft.dto.TrainerTO;
import com.dxc.luxoft.utill.ResponseTO;

@Service
public interface TrainerService {
	
	public ResponseTO registerTrainer(TrainerTO TrainerTo);
	
	public ResponseTO updatePassword(String userName, String oldPassword, String newPassword);
	
	

}

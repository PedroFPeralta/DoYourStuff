package com.peralta.DoYourStuff.dtos;

import com.peralta.DoYourStuff.entity.User;

import java.util.Date;

public record TaskDTO(int id, String title, String description, Date limitDateToBeDone, User assignedTo, User whoLastChange) {
}

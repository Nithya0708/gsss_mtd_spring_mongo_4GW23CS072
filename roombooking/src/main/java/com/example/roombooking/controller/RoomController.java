package com.example.roombooking.controller;

import com.example.roombooking.model.Room;
import com.example.roombooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation;

imoprt java.util.*;

@RestController
@RequestMapping("/api/rooms")
@CrossOrigin
public class RoomController {
	
	@Autowired
	private RoomRepository roomRepository;
	
	@PostMapping
	public ResponseEntity<?> createRoom(@RequestBody Room room){
		try {
			Room saved = roomRepository.save(room);
			return ResponseEntity.status(201).body(Map.of("message", "Room created successfully", "room", saved));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(Map.of("message", "Error creating the room details"));
		}
	}
	@GetMapping
	public ResponseEntity<?> getAllRooms() {
		return ResponseEntity.ok(roomRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getRoomById(@PathVAriable String id) {
		Optional<Room> optionalRoom = roomRepository.findById(id);
		if (optionalRoom.isPresent()) {
			return ResponseEntity.ok(optionalRoom.get());
		} else {
			return ResponseEntity.status(404).body(Map.of("message", "Room details not found"));
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRoom(@PathVAriable String id, @RequestBody Room updateRoom) {
		Optional<Room> optionalRoom = roomRepository.findById(id);
		if (optionalRoom.isPresent()) {
			updatedRoom.setId(id);
			roomRepository.save(updateRoom);
			return ResponseEntity.status(200).body(Map.of("message", "Room details updated successfully"));
		} else {
			return ResponseEntity.status(404).body(Map.of("message", "Room details not found"));
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteRoom(@PathVAriable String id) {
			Optional<Room> optionalRoom = roomRepository.findById(id);
			if (optionalRoom.isPresent()) {
				roomRepository.deleteById(id);
				return ResponseEntity.status(200).body(Map.of("message", "Room details deleted successfully"));
			} else {
				return ResponseEntity.status(404).body(Map.of("message", "Room details not found"));
			}
				
			}
		}
		
}
package org.example.pastebox.controller;

import lombok.RequiredArgsConstructor;
import org.example.pastebox.api.request.PasteboxRequest;
import org.example.pastebox.api.response.PasteboxResponse;
import org.example.pastebox.api.response.PasteboxUrlResponse;
import org.example.pastebox.service.PasteboxService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class PasteBoxController {

    private final PasteboxService pasteboxService;

    @GetMapping("/")
    public List<PasteboxResponse> getPublicPasteList() {
        return pasteboxService.getFirstPublicPasteboxes();
    }

    @GetMapping("/{hash}")
    public PasteboxResponse getByHash(@PathVariable String hash) {
        return pasteboxService.getByHash(hash);
    }

    @PostMapping("/")
    public PasteboxUrlResponse add(@RequestBody PasteboxRequest request) {
        return pasteboxService.create(request);
    }
}

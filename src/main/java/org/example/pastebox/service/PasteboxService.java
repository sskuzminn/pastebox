package org.example.pastebox.service;

import org.example.pastebox.api.request.PasteboxRequest;
import org.example.pastebox.api.response.PasteboxResponse;
import org.example.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public interface PasteboxService {
    PasteboxResponse getByHash(String hash);
    List<PasteboxResponse> getFirstPublicPasteboxes();
    PasteboxUrlResponse create(PasteboxRequest request);
}

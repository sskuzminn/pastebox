package org.example.pastebox.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.pastebox.api.request.PublicStatus;

@Data
@RequiredArgsConstructor
public class PasteboxResponse {
    private final String data;
    private final boolean isPublic;
}

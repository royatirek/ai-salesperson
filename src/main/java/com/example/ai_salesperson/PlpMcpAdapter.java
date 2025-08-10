package com.example.ai_salesperson;

import com.example.ai_salesperson.client.HopscotchClient;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class PlpMcpAdapter {

    private HopscotchClient hopscotchClient;
    public PlpMcpAdapter(HopscotchClient hopscotchClient) {
        this.hopscotchClient = hopscotchClient;
    }

    @Tool(description = "to kids clothes on hopscotch website")
    public String searchProducts(@ToolParam(description = "keyword for searching on hopscotch") String keyword) {
        return hopscotchClient.searchProducts(keyword, keyword, 1, 1, keyword);
    }


}

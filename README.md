# AI Salesperson

It uses a Spring AI MCP server to help an LLM (like Claude) connect with the Hopscotch website, allowing customers to search for and order products. It integrates with an external website named hopscotch.in to manage shopping carts and customer addresses.

This is a Gradle project.

## Integration with Claude

To use this as an MCP server with Claude, you can use a configuration like the following:

```json
{
  "mcpServers": {
    "ai-salesperson": {
      "command": "java",
      "args": [
        "-Dspring.ai.mcp.server.stdio=true",
        "-jar",
        "/Users/rockstar/Documents/AI/ai-salesperson/build/libs/ai-salesperson-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}
```

## Important Note on Authentication

To use this service, you must provide your own cookie in the `FeignClientConfiguration.java` file. This is required to authenticate with the external "Hopscotch" service.

## Core Functionalities

*   **Product Search**: Helps customers find products.
*   **Order Placement**: Allows customers to order products.
*   **Cart Management**: Allows adding items to a customer's shopping cart.
*   **Address Selection**: Allows selecting a shipping address for an order.

## Technologies Used

*   **Java 17**: The application is built using Java 17.
*   **Spring Boot**: Provides the core framework for the application, including web and Feign client support.
*   **Spring AI**: Used for the MCP server functionality to connect the LLM to the Hopscotch website.
*   **Gradle**: Used for dependency management and building the project.
*   **Feign Client**: Used for declarative REST API communication with the Hopscotch service.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 17 or later.
*   Gradle.

### Running the application

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd ai-salesperson
    ```

2.  **Build the project:**
    ```bash
    ./gradlew build
    ```

3.  **Run the application:**
    ```bash
    java -jar build/libs/ai-salesperson-0.0.1-SNAPSHOT.jar
    ```

The application will start on the default port `8080`.

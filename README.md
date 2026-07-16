# Minimal Spring Boot API

A lightweight, minimal Spring Boot starter API demonstrating fundamental REST mapping concepts. This project exposes simple GET endpoints to return static string data and handle dynamic query parameters for basic math calculations.

---

## 🚀 Features

* **Basic Routing**: Exposes a root endpoint and custom path mappings returning direct string responses.
* **Query Parameter Parsing**: Demonstrates the use of `@RequestParam` annotations to capture inputs from the URL path.
* **Dynamic Math Processing**: Features an on-the-fly summation utility that calculates the sum of two integers parsed from HTTP queries.

---

## 📂 Structural Overview

This is a single-controller API built to keep boilerplates to a minimum:
* **Controller (`Hello`)**: Serves as the primary entry point for web routing, handling user requests and directly returning strings or integers without additional service layers or database interactions.

---

## 🛣️ Active API Endpoints

All mapped resources can be accessed directly from the server's root port (default is `http://localhost:8080`):

| Method | Endpoint | Description | Parameters / Requirements | Example Return |
| :--- | :--- | :--- | :--- | :--- |
| **GET** | `/` | Welcomes the client with a friendly greeting. | None. | `"Hello Fellas"` |
| **GET** | `/sum` | Takes two integers and returns their sum. | Requires query params: `n` and `m` (e.g., `/sum?n=5&m=10`) | `15` |
| **GET** | `/smthing` | A placeholder route returning a static string response. | None. | `"Blah Blah Blah"` |

---

## 🛠️ Technology Stack

* **Java** (JDK 17+)
* **Spring Boot Framework** (Spring Web starter)

---

## ⚡ Quick Start

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/minimal-api.git](https://github.com/your-username/minimal-api.git)

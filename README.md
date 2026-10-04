# Brull (BrullP12026)

Brull is a modern full-stack application designed to manage and track three distinct classes of items (*foobars*): **DefectPins** (equipment and facility failures), **FoundPins** (found items), and **LostPins** (lost property). Developed as an HBO software engineering project, it combines a robust Ktor backend with a native Android Jetpack Compose frontend.

## 🚀 Tech Stack

### Backend (Web API)
* **Kotlin** with the **Ktor** framework.
* Structured via feature-modules following a strict 3-layer architecture (`Route` → `Service` → `Repository`).
* In-memory repository pattern pre-populated with realistic initial test data (fully prepared for future database integration via Exposed).

### Frontend (Android App)
* **Kotlin** with **Jetpack Compose** & Material Design 3.
* Bilingual GUI (**Dutch and English** via Android string resources).
* Hardware sensor integration: **GPS Location** (`GeoPoint`) and **Camera** (`Photographable`).

## 📐 Domain Architecture

The core domain relies on a clean, polymorphic object hierarchy:
* **`Pin`** (Abstract Sealed Class)
  * `DefectPin` (Manages defect workflows: OPEN → IN_PROGRESS → RESOLVED/CLOSED)
  * `FoundPin` (Manages found item workflows: OPEN → CLAIMED/CLOSED)
  * `LostPin` (Manages lost item workflows: OPEN → RESOLVED/CLOSED)
* **Interfaces**: `GeoTagged` (GPS tracking) and `Photographable` (Camera image attachment).

## 🎨 Visual Identity & Logo Concept
* **Concept:** A combination of a map pin and a megaphone, symbolizing the clear reporting and broadcasting of important items or defects.
* **Color Palette:** Deep Indigo (`#3F51B5`) for reliability and structured navigation, paired with an energetic Coral Orange (`#FF5722`) for active pins.

## 🧪 Testing Strategy

The project includes a comprehensive test suite to ensure system reliability:
* **Domain Unit Tests**: Validating state transitions (`allowedNext()`), business rules (`canDelete()`), and validation logic.
* **Repository Tests**: Verifying in-memory data filtering and CRUD operations.
* **Integration Tests**: End-to-end testing of Ktor API endpoints using `testApplication`.
* **UI Tests**: Jetpack Compose UI tests verifying screen rendering and layout behavior.

## 🛠️ Getting Started

1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/BrullP12026.git](https://github.com/your-username/BrullP12026.git)

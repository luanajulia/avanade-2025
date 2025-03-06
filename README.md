# avanade - 2025

classDiagram
    class Usuario {
        - String name
        - String corporation
        - List~Feature~ features
    }
    class Feature {
        - String icon
        - String description
    }
    Usuario --> Feature

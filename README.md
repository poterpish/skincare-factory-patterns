# Skincare Factory Patterns

## Topic

This project demonstrates the Factory Method and Abstract Factory design patterns using a skincare domain.

## Part A — Factory Method

The Factory Method part creates different skincare products.

### Product
- SkincareProduct

### Concrete Products
- Cleanser
- Toner
- Serum

### Creator
- SkincareCreator

### Concrete Creators
- CleanserCreator
- TonerCreator
- SerumCreator

Each concrete creator decides which skincare product to create.

## Part B — Abstract Factory

The Abstract Factory part creates families of skincare products for different skin types.

### Product Interfaces
- Cleanser
- Moisturizer
- Sunscreen

### Abstract Factory
- SkincareFactory

### Product Families

Dry Skin:
- DrySkinCleanser
- DrySkinMoisturizer
- DrySkinSunscreen

Oily Skin:
- OilySkinCleanser
- OilySkinMoisturizer
- OilySkinSunscreen

### Concrete Factories
- DrySkinFactory
- OilySkinFactory

The client receives a SkincareFactory and works with product interfaces.

## Main Difference

Factory Method creates one type of product and uses inheritance.

Abstract Factory creates a family of related products and uses composition.

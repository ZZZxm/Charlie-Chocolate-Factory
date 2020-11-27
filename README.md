# Charlie Chocolate Factory
Design Pattern | Tongji University course project 

---
## 设计模式
### 23 Design Patterns

- [x] Abstract Factory
- [x] Adapter
- [x] Bridge
- [x] Builder
- [x] Chain of Responsibility
- [x] Command
- [x] Composite
- [x] Decorator
- [x] Facade
- [x] Factory Method
- [x] Flyweight
- [x] Interpreter
- [x] Iterator
- [x] Mediator
- [x] Memento
- [x] Observer
- [x] Prototype
- [x] Proxy
- [x] Singleton
- [x] State
- [x] Strategy
- [x] Template Method
- [x] Visitor

### Extra

- [x] Business Delegate
- [x] Callback
- [x] Converter
- [x] COW
- [x] Data Access Object
- [x] Dirty Flag
- [x] Extension Object
- [x] Filter
- [x] Immutable
- [x] IOC
- [x] Monostate
- [x] Multiton
- [x] Null Object
- [x] Value Object
- [x] Transfer Object

## 项目结构
```
├─.idea
│  ├─codeStyles
│  └─inspectionProfiles
└─src
    ├─team
    │  └─charliechocolatefactory
    │      ├─factory
    │      │  └─support
    │      │      └─payroll
    │      ├─machine
    │      │  ├─centralcontrolcomputer
    │      │  ├─extension
    │      │  ├─processmachine
    │      │  │  ├─productmachine
    │      │  │  │  └─milkchocmachine
    │      │  │  └─wrappermachine
    │      │  │      └─strategy
    │      │  ├─qualitytestmachine
    │      │  │  └─qualitytestsystem
    │      │  └─transportmachine
    │      │      └─UAVs
    │      ├─person
    │      │  ├─DAO
    │      │  ├─filterchain
    │      │  │  └─message
    │      │  ├─staff
    │      │  │  └─worker
    │      │  │      ├─fixworker
    │      │  │      └─utilityworker
    │      │  └─visitor
    │      │      ├─converter
    │      │      └─limit
    │      ├─product
    │      │  ├─chocolate
    │      │  ├─chocolateProduct
    │      │  │  └─chocolatemix
    │      │  ├─memento
    │      │  ├─Sandwich
    │      │  └─state
    │      ├─rawmaterial
    │      │  ├─foodmaterial
    │      │  └─packagematerial
    │      ├─scene
    │      │  ├─decorator
    │      │  ├─publicarea
    │      │  └─staffarea
    │      │      ├─manufacturingarea
    │      │      │  ├─assemblyline
    │      │      │  ├─warehouse
    │      │      │  │  └─Delegate
    │      │      │  └─workshop
    │      │      └─WorkerIterator
    │      └─supplement
    │          ├─handmadetool
    │          ├─monostate
    │          ├─proxy
    │          └─receipt
    └─test
        └─DesignPatternTest
```

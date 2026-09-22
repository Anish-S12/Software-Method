# CS 213 Project 1 — Parking Management System

Team: Anish + Sai

## Project structure (submission layout)

```
Software-Method/          ← zip THIS folder for Canvas
├── src/
│   └── parking/          ← lowercase package (required)
│       ├── RunProject1.java
│       ├── Operation.java
│       ├── Date.java
│       ├── Timestamp.java
│       ├── Vehicle.java
│       ├── History.java
│       ├── VehicleList.java
│       ├── Parking.java
│       ├── Deck.java
│       ├── DeckList.java
│       ├── Location.java   (enum)
│       └── Hour.java       (enum)
├── test/
│   └── TestSpecification.md   ← copy tables into Word/Google Docs
├── doc/                       ← put generated Javadoc *.html here
└── README.md
```

## Before you submit — grading checklist

### Source (`src/`) — 100 pts area
- [ ] Package name is lowercase (`parking`)
- [ ] Every class has `@author` with who implemented it
- [ ] One public class per `.java` file; file name matches class name
- [ ] All required classes exist and are used
- [ ] `@Override` on every overriding method
- [ ] Allowed imports only: `Scanner`, `StringTokenizer`, `Calendar`, `DecimalFormat`
- [ ] No `ArrayList` / Collections / `Arrays.sort` / `System.arraycopy`
- [ ] No `import java.util.*` (or any `.*`)
- [ ] `System.in` / `System.out` only in `Operation`, testbed `main()`s, and `print*()` methods
- [ ] `Operation.run()` under 40 lines; processes multiple lines per paste
- [ ] Startup / quit messages match the spec exactly
- [ ] Match `Project1Output.txt` when pasting `Project1TestCases.txt` (files from Canvas)

### Test specification — 15 pts
- [ ] Word/Google Doc using Coding Standard table template
- [ ] No Java code in that document
- [ ] Date `isValid()`: 4 invalid + 2 valid
- [ ] Timestamp `compareTo()`: 3× -1, 3× +1, 1× 0

### Testbed mains — 20 pts
- [ ] `Date.main()` — 6 cases from your spec
- [ ] `Timestamp.main()` — 7 cases from your spec

### Javadoc — 5 pts
- [ ] Generated with private scope into `doc/`
- [ ] `index.html` present; comments not empty

## How TAs run your project

Run `parking.RunProject1`, paste `Project1TestCases.txt` into the terminal (do **not** read that file from disk).

## Allowed libraries reminder

Only: `java.util.Scanner`, `java.util.StringTokenizer`, `java.util.Calendar`, `java.text.DecimalFormat`.

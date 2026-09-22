# Test Specification — Project 1

**Instructions:** Copy these tables into Microsoft Word or Google Docs before writing any testbed `main()` code.
Do **not** put Java code in this document (that costs the full 15 points).

Fill in expected results and your own test data. Use the Coding Standard table template style from Canvas.

---

## Date.isValid() — 6 test cases (4 invalid, 2 valid)

| Test Case # | Date under test (year, month, day) | Expected result | Actual result | Pass / Fail |
|---|---|---|---|---|
| 1 (invalid) | | `false` | | |
| 2 (invalid) | | `false` | | |
| 3 (invalid) | | `false` | | |
| 4 (invalid) | | `false` | | |
| 5 (valid) | | `true` | | |
| 6 (valid) | | `true` | | |

**Ideas for invalid cases:** bad month, day too large for month, Feb 29 non-leap year, Feb 30, day 0, etc.
**Ideas for valid cases:** leap-year Feb 29, normal 31-day month.

---

## Timestamp.compareTo() — 7 test cases (3 → -1, 3 → 1, 1 → 0)

| Test Case # | Timestamp A | Timestamp B | Expected (`compareTo`) | Actual | Pass / Fail |
|---|---|---|---|---|---|
| 1 (returns -1) | | | `-1` | | |
| 2 (returns -1) | | | `-1` | | |
| 3 (returns -1) | | | `-1` | | |
| 4 (returns 1) | | | `1` | | |
| 5 (returns 1) | | | `1` | | |
| 6 (returns 1) | | | `1` | | |
| 7 (returns 0) | | | `0` | | |

**Coverage tips:** differ by date only, by hour only, by minute only, and equal timestamps.

---

After this doc is done, implement the same cases in:
- `Date.main()` (6 cases) — 9 points
- `Timestamp.main()` (7 cases) — 11 points

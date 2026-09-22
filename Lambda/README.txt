ALL JAVA EXERCISES - SINGLE FOLDER
=====================================
Every file for exercises 15.4-15.8 and 16.12-16.21 is in this one folder
(no subfolders). Compile everything at once with:

    javac *.java

Then run whichever exercise you want with "java <ClassName>" as listed
below. Because several exercises originally reused the same class names
(Account, TransactionRecord, CreateData, FileMatch), those classes were
renamed with a "_15_4" / "_15_5" / "_15_6" suffix so they could all live
together in one folder without conflicting. Every other file kept its
original class name since there were no naming clashes.

--------------------------------------------------------------
EXERCISE 15.4 (File Matching)
  Classes:  Account_15_4, TransactionRecord_15_4, CreateData_15_4, FileMatch_15_4
  Run:      java CreateData_15_4    -> creates oldmast.txt and trans.txt
            java FileMatch_15_4     -> creates newmast.txt and log.txt

EXERCISE 15.5 (File Matching with Multiple Transactions)
  Classes:  Account_15_5, TransactionRecord_15_5, CreateData_15_5, FileMatch_15_5
  Run:      java CreateData_15_5
            java FileMatch_15_5
  (Rename or move 15.4's output files first if you want to keep them -
  both exercises write to oldmast.txt / trans.txt / newmast.txt / log.txt.)

EXERCISE 15.6 (File Matching with Object Serialization)
  Classes:  Account_15_6, TransactionRecord_15_6, CreateData_15_6,
            FileMatch_15_6, ReadSerializedData_15_6
  Run:      java CreateData_15_6         -> creates oldmast.ser, trans.ser
            java FileMatch_15_6          -> creates newmast.ser, log.txt
            java ReadSerializedData_15_6 -> prints newmast.ser to the screen

EXERCISE 15.7 (Telephone-Number Word Generator)
  Class:    PhoneWordGenerator
  Run:      java PhoneWordGenerator
  Enter a 7-digit number (digits 2-9 only, e.g. 6862377) to get every
  possible 7-letter word combination in phonewords.txt.

EXERCISE 15.8 (Student Poll)
  Classes:  CreateSurveyFile, AnalyzeSurvey
  Run:      java CreateSurveyFile  -> type ratings 1-9, then -1 to stop;
                                       saves to numbers.txt
            java AnalyzeSurvey     -> tallies numbers.txt into output.txt

--------------------------------------------------------------
EXERCISE 16.12 (Concise LinkedList with asList)
  Class:    ConciseLinkedList
  Run:      java ConciseLinkedList
  NOTE: Fig. 16.3 wasn't provided, so this is a self-contained example of
  the same concept: building a LinkedList in one line with Arrays.asList.

EXERCISE 16.13 (Duplicate Elimination)
  Class:    DuplicateElimination
  Run:      java DuplicateElimination
  Type first names, "done" to stop, then search for a name ("quit" to stop).

EXERCISE 16.14 (Counting Letters)
  Class:    CountingLetters
  Run:      java CountingLetters
  NOTE: Fig. 16.18 wasn't provided; this counts letters in "HELLO THERE".

EXERCISE 16.16 (Counting Duplicate Words)
  Class:    CountingDuplicateWords
  Run:      java CountingDuplicateWords
  Type a sentence; reports words that appear more than once.

EXERCISE 16.17 (Sorted LinkedList Insert)
  Class:    SortedLinkedListInsert
  Run:      java SortedLinkedListInsert
  Inserts 25 random ints (0-100) into a LinkedList in sorted order, then
  prints the sum and average.

EXERCISE 16.18 (Copying and Reversing LinkedLists)
  Class:    CopyReverseLinkedList
  Run:      java CopyReverseLinkedList

EXERCISE 16.19 (Prime Numbers and Prime Factors)
  Class:    PrimeFactors
  Run:      java PrimeFactors
  Enter a whole number; if not prime, prints its unique prime factors
  (try 54 -> prints 2 and 3).

EXERCISE 16.20 (Sorting Words with a TreeSet)
  Class:    TreeSetSortedWords
  Run:      java TreeSetSortedWords
  Type a line of text; prints its words sorted alphabetically, duplicates
  removed.

EXERCISE 16.21 (PriorityQueue in Descending Order)
  Class:    PriorityQueueDescending
  Run:      java PriorityQueueDescending
  NOTE: Fig. 16.15 wasn't provided; this is a self-contained example
  showing a PriorityQueue<Double> that removes the largest value first.

--------------------------------------------------------------
EXERCISE 17.10 (Summarizing the File Types in a Directory)
  Class:    DirectoryFileTypeSummary
  Run:      java DirectoryFileTypeSummary
  Enter a directory path; it counts how many files of each extension are
  in it. NOTE: the exercise describes a DirectoryStream.entries() default
  method that returns a Stream<Path> - that method does not actually exist
  in any released JDK (checked on JDK 21). This program uses the real,
  standard equivalent, Files.list(directory), which returns a Stream<Path>
  and accomplishes the same thing.

EXERCISE 17.11 (Manipulating a Stream)
  Classes:  Invoice, InvoiceStreams
  Run:      java InvoiceStreams
  NOTE: Fig. 17.20 (the exact sample invoice data) wasn't provided, so
  InvoiceStreams uses reasonable sample data of the same shape (part
  number, description, quantity, price). It performs all five parts:
  (a) sort by description, (b) sort by price, (c) map to description+
  quantity sorted by quantity, (d) map to description+value sorted by
  value, (e) same as (d) filtered to values between $200 and $500.

EXERCISE 17.12 (Duplicate Word Removal)
  Class:    UniqueWordsAlphabetical
  Run:      java UniqueWordsAlphabetical
  Type a sentence (no punctuation); prints its unique words in
  alphabetical order, case-insensitive.

EXERCISE 17.13 (Sorting Letters and Removing Duplicates)
  Class:    SortRemoveDuplicateLetters
  Run:      java SortRemoveDuplicateLetters
  Generates 30 random letters and shows them (a) sorted ascending,
  (b) sorted descending, (c) sorted ascending with duplicates removed.

EXERCISE 17.14 (Mapping Then Reducing an IntStream for Parallelization)
  Class:    SumOfSquaresReduce
  Run:      java SumOfSquaresReduce
  NOTE: Fig. 17.5 wasn't provided, so this is a self-contained example of
  the same idea: it maps each value to its square FIRST, then reduces
  with plain addition, instead of squaring and adding in one
  non-associative reduce step (the non-associative version is shown
  commented out in the file for comparison).

--------------------------------------------------------------
SKIPPED
  15.9 (Shape Drawing App) and 16.15 (Color Chooser) were skipped, since
  both center on drawing a shape.

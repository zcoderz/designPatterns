
Facade pattern is used to create a simplified interface over various complicated
interfaces.

For example , facade pattern is used by a compiler to provide a simple
interface over :

1. Tokenizer (Tokens)
2. Parser (Abstract syntax tree)
3. Intermediate representation (IR Code)
4. Optimize
5. Code generator
6. Linker

Instead of users having to deal with the above complexity, they can use the simplified interface provided
by the facade (compiler).
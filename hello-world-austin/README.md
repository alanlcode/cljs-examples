# hello-world-austin

Hello world using Austin instead of cljs-repl.

## Overview

Testing out Austin.

## Setup

Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./script/watch

To start a browser REPL:
    
2. Run `./scripts/connect`
3. Browse to `http://localhost:8080` (you should see `Hello world!` in the web console)
4. (back to step 3) you should now see the REPL prompt: `cljs.user=>`
5. You may now evaluate ClojureScript statements in the browser context.

To start a phantomjs headless REPL:

    ./script/phantomjs

To start a Chrome REPL whose lifetime is managed by Austin:

    ./script/chrome
    
Clean project specific out:

    lein clean
     
Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release


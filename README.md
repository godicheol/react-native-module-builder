## Usage

```console
git clone https://github.com/godicheol/react-native-module-builder.git && cd react-native-module-builder && npm install && npm run unlink
```

```js
// package.json
...
"bundleDependencies": [
    // add installed library name
]
...
```

```console
npm pack
```

```console
npm install blah-blah.tgz
```

```js
import MyModule from 'react-native-module-builder';
const {getName, multiply} = MyModule;
await multiply(1, 2); // 2
```
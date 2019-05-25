## Shadow-cljs and react-native with haul

```sh
$ yarn # fetch the node modules
$ npx shadow-cljs watch app # start shadow
# start an emulator (ex. android avd)
$ yarn start #starts haul bundler
# open to app inside the emulator with either of one ways
$ cd android && ./gradlew app:installDebug # option1
$ react-native run-android # option2 (via npm i react-native-cli -g)
$ android-studio # option3 - import the project and pless the "run button"
```

### Other

- Enable hot-reload on the emulator
- Disable delta bundles if that feature is on the emulator
- in case of strangeness: reload with ctrl-m + 'reload' or re-run `cd android && ./gradlew app:installDebug`

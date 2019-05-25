## Shadow-cljs and react-native with haul

```sh
yarn
# start an emulator (ex. android avd)
yarn start
# open to app inside the emulator with either of one ways
$ cd android && ./gradlew app:installDebug
$ react-native run-android # from npm i react-native-cli -g
$ android-studio # import the project and pless the "run button"
```

### Other

- Enable hot-reload on the emulator
- Disable delta bundles if that feature is on the emulator
- in case of strangeness: reload with ctrl-m + 'reload' or re-run `cd android && ./gradlew app:installDebug`

Floppy
=====================
#### The mod that makes your fish flop their way to the water.
This is a pretty simple mod. It adds velocity on each flop that brings it to the closest water source. It does not change the behavior of other fish like mobs (eg. Guardians). It should be compatible with almost all mods. If not please inform me in the [issues](https://github.com/Aperre/floppy/issues). It will also work with all mobs that use the `AbstractFish` class.

## Compatibility (1.0.2)

Fabric has two version-range builds:
- `floppy-1.0.2-fabric-mc1.21.1-1.21.8.jar`
- `floppy-1.0.2-fabric-mc1.21.10-1.21.11.jar`

NeoForge uses a separate JAR for each Minecraft version because its loader release line is tied to the Minecraft minor version. GitHub Actions builds these exact targets:
- `floppy-1.0.2-neoforge-mc1.21.1.jar`
- `floppy-1.0.2-neoforge-mc1.21.2.jar`
- `floppy-1.0.2-neoforge-mc1.21.3.jar`
- `floppy-1.0.2-neoforge-mc1.21.4.jar`
- `floppy-1.0.2-neoforge-mc1.21.5.jar`
- `floppy-1.0.2-neoforge-mc1.21.6.jar`
- `floppy-1.0.2-neoforge-mc1.21.7.jar`
- `floppy-1.0.2-neoforge-mc1.21.8.jar`
- `floppy-1.0.2-neoforge-mc1.21.10.jar`
- `floppy-1.0.2-neoforge-mc1.21.11.jar`

Minecraft 1.21.9 is intentionally not included.

## Building

Run `./gradlew :neoforge:build` for the default NeoForge 1.21.1 target. The GitHub Actions matrix builds all supported targets separately.

## License

MIT. See [LICENSE.md](LICENSE.md).

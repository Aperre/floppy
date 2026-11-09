Floppy
=====================
#### The mod that makes your fish flop their way to the water.
This is a pretty simple mod. It adds velocity on each flop that brings it to the closest water source. It does not change the behavior of other fish like mobs (eg. Guardians). It should be compatible with almost all mods. If not please inform me in the [issues](https://github.com/Aperre/floppy/issues). It will also work with all mobs that use the `AbstractFish` class.

## Fabric and NeoForge compatibility (1.0.2)

Use the JAR matching both your Minecraft version and mod loader.

| Loader | JAR | Minecraft versions |
| --- | --- | --- |
| Fabric | `floppy-1.0.2-fabric-mc1.21.1-1.21.8.jar` | 1.21.1–1.21.8 |
| Fabric | `floppy-1.0.2-fabric-mc1.21.10-1.21.11.jar` | 1.21.10–1.21.11 |
| NeoForge | `floppy-1.0.2-neoforge-mc1.21.1-1.21.8.jar` | 1.21.1–1.21.8 |
| NeoForge | `floppy-1.0.2-neoforge-mc1.21.10-1.21.11.jar` | 1.21.10–1.21.11 |

Minecraft 1.21.9 is intentionally not supported by these variants.

NeoForge builds use the 21.1.x line for the first range and 21.10.x for the second. The newer variant is compiled against Minecraft 1.21.10 and uses the corresponding NeoForge 21.10 loader line.

## Building

The GitHub Actions matrix builds all four production JARs separately. For local builds, the default target is Minecraft 1.21.1.

```bash
./gradlew :neoforge:build
```

## License

This project is licensed under the MIT License. See [LICENSE.md](LICENSE.md).

Floppy
=====================
#### The mod that makes your fish flop their way to the water.
This is a pretty simple mod. It adds velocity on each flop that brings it to the closest
water source. It does not change the behavior of other fish like mobs (eg. Guardians).
It should be compatible with almost all mods. If not please inform me in the [issues](https://github.com/Aperre/floppy/issues).
It will also work with all mobs that use the `AbstractFish` class.

## Fabric compatibility (1.0.2)

There are two Fabric JARs because Minecraft 1.21.9 changed intermediary method mappings used by the fish mixin.
Use the JAR matching your Minecraft version:

| JAR | Minecraft versions |
| --- | --- |
| `floppy-1.0.2-fabric-mc1.21.1-1.21.8.jar` | 1.21.1 through 1.21.8 |
| `floppy-1.0.2-fabric-mc1.21.10-1.21.11.jar` | 1.21.10 through 1.21.11 |

Minecraft 1.21.9 is intentionally not supported by either JAR.

## Building

Build the older Fabric variant (compiled against 1.21.1):

```bash
./gradlew :fabric:build -Pminecraft_version=1.21.1 "-Pfabric_minecraft_version_range=>=1.21.1 <1.21.9"
```

Build the newer Fabric variant (compiled against 1.21.10):

```bash
./gradlew :fabric:build -Pminecraft_version=1.21.10 "-Pfabric_minecraft_version_range=>=1.21.10 <1.21.12"
```

Both commands write `fabric/build/libs/floppy-1.0.2-fabric.jar`; rename or copy the output before building the other variant. GitHub Actions builds and uploads both variants separately.

To build all loader projects using the default Minecraft 1.21.1 configuration, run:

```bash
./gradlew build
```

## License

This project is licensed under the MIT License. See [LICENSE.md](LICENSE.md).

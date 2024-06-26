# Kotlin Math Utils (KMU)

Библиотека математических функций и объектов. Библиотека предназначается для разработки в области компьютерной графики и процедурной генерации.

Реализация линейной алгебры сделана таким образом, что может быть удобно использована совместно с [LWJGL](https://github.com/LWJGL/lwjgl3) (OpenGL). Многие методы и функции портированы из [GLM](https://github.com/g-truc/glm) и полностью соответствуют методам GLM, однако полного соответствия достичь не удалось.

## Features

+ Поддержка векторов и матриц:
+ + Двухкомпонентные вектора (типы float32, float64, int32, int64). **Планируется**  поддержка как подхода SoA, так и AoS.
+ + Трехкомпонентные вектора (типы float32, float64, int32, int64). **Планируется**  поддержка как подхода SoA, так и AoS.
+ + Квадратные матрицы размерности 4x4 (mat4).
+ Поддержка базовых шумов:
+ + Классический шум Перлина (Perlin Noise).
+ + Многооктавный шум (Fractal Brownian Motion).
+ + Клеточный шум или Шум Ворли (Worley Noise / Cellular Noise).
+ Поддержка возможности использования декораторов для шума, что позволяет тонко настраивать их параметры.
+ Библиотечные методы построены на основе интерфейсов для ГСПЧ разнообразных размерностей.

## Demo

В коде имеется модуль Demo, который включает в себя программу генерации изображений-примеров для различных шумов с различными параметрами. Для запуска генернерации изображений шумов:

```bash
./gradlew :demo:run
```

После выполнения программы будут сгенерированы PNG-изображения с примерами сгенерированных шумов.

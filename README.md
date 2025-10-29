## Задачи в ДЗ 18:

### Задача 1: Переход через несколько фрагментов с сохранением состояний
Шаги:  
  1. Создай несколько фрагментов, например, HomeFragment, DetailsFragment, и SettingsFragment.
  2. В HomeFragment размести кнопку для перехода в DetailsFragment, а из DetailsFragment — в SettingsFragment.
  3. Для каждого фрагмента используй NavGraph с переходами.
  4. Убедись, что при возвращении на предыдущие фрагменты их состояния сохраняются.
     
Подсказка: Используй addToBackStack для сохранения состояний при переходах.  

### Задача 2: Переход между фрагментами с передачей аргументов
Шаги:
  1. Создай два фрагмента: FirstFragment и SecondFragment.
  2. В FirstFragment создавай кнопку, по нажатию на которую будет передаваться строка в SecondFragment.
  3. В SecondFragment отобрази переданное сообщение.
  4. Используй Safe Args для передачи данных через NavGraph.  

Подсказка: В nav_graph.xml нужно указать аргумент для SecondFragment.

### Задача 3: Обработка возвращаемых данных из фрагмента
Шаги:
  1. Создай два фрагмента: FirstFragment и SecondFragment.
  2. На экране FirstFragment размести кнопку, при нажатии на которую откроется SecondFragment.
  3. В SecondFragment создай кнопку, которая при нажатии отправляет результат обратно в FirstFragment через setResult() и
NavController.
  4. В FirstFragment отобрази возвращённые данные в TextView.
     
Подсказка: Используй setResult() для передачи данных назад.  


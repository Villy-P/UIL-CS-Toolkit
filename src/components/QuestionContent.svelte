<script lang="ts">
	import type { Question } from "../types/question";
	import Markdown from "./Markdown.svelte";
    import { Text } from '@valerius_petrini/corekit-ui';

    let { question, index }: {
        question: Question;
        index: number;
    } = $props();

    let answered: boolean = $state(false);
    let correct: boolean = $state(false);

    function btnClick(index: number) {
        if (answered) return;
        answered = true;
        correct = index === question.correct;
    }
</script>

<Text tag="h3">Question #{index + 1}</Text>
<Markdown content={question.question}/>
{#if question.code}
    <Markdown content={"```java\n" + question.code.join("\n") + "\n```"}/>
{/if}
<div class="flex flex-col gap-1">
    {#each question.answers as answer, index}
        <button class="bg-[#151515] p-2 rounded-md w-96 cursor-pointer hover:bg-[#1f1f1f] my-0.5" onclick={() => btnClick(index)}>
            <Markdown content={answer}/>
        </button>
    {/each}
</div>
{#if answered}
    <div class="w-96 {correct ? 'bg-green-500' : 'bg-red-500'} p-2 rounded-md text-white">
        <Markdown content={correct ? "Correct!" : "Incorrect!"}/>
        <Markdown content={question.explanation}/>
    </div>
{/if}
<hr class="my-4"/>